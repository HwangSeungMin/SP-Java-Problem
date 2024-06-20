import java.util.ArrayList;
import java.util.List;
public class ThreeThreadListFilter {
    public static void main(String[] args) {
        // TODO: 작업할 List 생성
        int listSize = 1000;
        List<Integer> list = new ArrayList<>();
        for(int i =0;i<listSize;i++){
            list.add(i,null);
        }
        // 결과 확인
        System.out.println("List의 길이: " + list.size());
        System.out.println("List의 내용: " + list);

        // TODO: 3개의 쓰레드 생성, 업무 분담 실행
        Thread thread1 = new Thread(new ListFillerTask(0,list));
        Thread thread2 = new Thread(new ListFillerTask(1,list));
        Thread thread3 = new Thread(new ListFillerTask(2,list));


        // TODO: 3개 Thread 작업 진행
        thread1.run();
        thread2.run();
        thread3.run();

        // 결과 확인
        System.out.println("List의 길이: " + list.size());
        System.out.println("List의 내용: " + list);
    }

    // TODO: 자신이 맡은 리스트 인덱스의 값을 각각 0, 1, 2로 채우도록 구현하는 Task 구현 필요
    static class ListFillerTask implements Runnable {
        private int val;
        private List<Integer> list;
        ListFillerTask(int val,List<Integer> list){
            this.val = val;
            this.list = list;
            run();
        }
        @Override
        public void run() {
            for(int j=0;j<1000;j++){
                if(j%3==val){
                    setListIndexValue(list,val,j);
                }
            }
        }
    }

    public static synchronized void setListIndexValue(List<Integer> list, int val ,int idx){
        list.set(idx,val);
    }
}
