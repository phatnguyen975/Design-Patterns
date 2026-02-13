package StructuralPatterns.Decorator.Example02;

import StructuralPatterns.Decorator.Example02.datasource.DataSource;
import StructuralPatterns.Decorator.Example02.datasource.impl.FileDataSource;
import StructuralPatterns.Decorator.Example02.decorators.CompressionDecorator;
import StructuralPatterns.Decorator.Example02.decorators.DataSourceDecorator;
import StructuralPatterns.Decorator.Example02.decorators.EncryptionDecorator;

public class Main {

    public static void main(String[] args) {
        String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";
        DataSourceDecorator encoded = new CompressionDecorator(
                new EncryptionDecorator(
                        new FileDataSource("OutputDemo.txt")));
        encoded.writeData(salaryRecords);
        DataSource plain = new FileDataSource("OutputDemo.txt");

        System.out.println("- Input ----------------");
        System.out.println(salaryRecords);
        System.out.println("- Encoded --------------");
        System.out.println(plain.readData());
        System.out.println("- Decoded --------------");
        System.out.println(encoded.readData());
    }
}
