package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class AddOperation implements IOperation{
    public void work(BookList bookList){
        System.out.println("新增图书");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入图书名字:");
        String name = scanner.nextLine();
        System.out.println("请输入图书作者：");
        String author = scanner.nextLine();
        System.out.println("请输入图书价格：");
        int price = scanner.nextInt();
        System.out.println("leixing");
        String type = scanner.next();

        Book book = new Book(name,author,price,type);
        int curSize = bookList.getUseSize();
        bookList.setBooks(curSize,book);
        bookList.setUseSize(curSize+1);

        System.out.println("success");

    }
}
