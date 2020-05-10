package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class DelOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("删除图书");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入名字：");
        String name = scanner.nextLine();
        int i = 0;
        for (; i < bookList.getUseSize(); i++) {
            Book book = bookList.getBook(i);
            if(book.getName().equals(name)){
                break;
            }
        }
        if(i == bookList.getUseSize()){
            System.out.println("meiyouzhebenshu");
            return;
        }
        for (int pos = i; pos < bookList.getUseSize(); pos++) {
            Book book = bookList.getBook(pos+1);
            bookList.setBooks(pos,book);
        }
        bookList.setUseSize(bookList.getUseSize()-1);
        System.out.println("shanchuchenggong!");
    }
}
