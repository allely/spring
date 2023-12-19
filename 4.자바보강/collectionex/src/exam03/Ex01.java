package exam03;

import java.util.HashSet;
import java.util.TreeSet;

public class Ex01 { // exam02 반복
    public static void main(String[] args) {
//        HashSet<Book> books = new HashSet<>();    // 입력순서별 정렬이 안됨
        TreeSet<Book> books = new TreeSet<>();      //정렬 기준을 정해주지 않으면 오류.
                                                    // -> compareTo 메소드 추가로 해결.
        books.add(new Book("책1", "저자1", "출판사1"));
        books.add(new Book("책2", "저자2", "출판사2"));
        books.add(new Book("책2", "저자2", "출판사2"));
        books.add(new Book("책3", "저자3", "출판사3"));
        books.add(new Book("책4", "저자4", "출판사4"));
        books.add(new Book("책5", "저자5", "출판사5"));

        for(Book book : books) {
            System.out.println(book);
        }
    }
}
