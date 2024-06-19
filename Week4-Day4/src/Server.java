import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

class Server {

    public static void main(String[] args) {

        List<User> userList = new ArrayList<>();

        try(ServerSocket serverSocket = new ServerSocket(1234); // 서버 소켓 생성
        ){
            System.out.println("서버가 시작되었습니다.");

            while(true) {
                try (Socket clientSocket = serverSocket.accept()) {
                    System.out.println("클라이언트가 연결되었습니다.");

                    // 클라이언트로부터 전송된 UserDTO 수신
                    ObjectInputStream ois = new ObjectInputStream(clientSocket.getInputStream());
                    UserDTO userDTO = (UserDTO) ois.readObject();
                    System.out.println("클라이언트로부터 받은 유저 정보: " + userDTO.getUsername());

                    // UserDTO를 User 객체로 변환
                    User user;
                    if (userDTO.getRole().equals("admin")) {user = new AdminUser(userDTO.getUsername());}
                    else {user = new User(userDTO.getUsername());}

                    userList.add(user);
                    System.out.println("새로운 유저가 등록되었습니다. " + userList );

                    OutputStream serverOutputStream = clientSocket.getOutputStream();
                    PrintWriter printWriter = new PrintWriter(serverOutputStream, true);

                    printWriter.println("현재 고객대기명단은: " + userList);

                } catch (IOException | ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}