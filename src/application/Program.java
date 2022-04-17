package application;

import db.DB;
import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.sql.Connection;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Program {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Department department = new Department(1, "Books");
        Seller seller = new Seller(1, "Moacir", "moacir@gmail.com", sdf.parse("12/04/2002"), 18000D, department);
        SellerDao sellerDao = DaoFactory.createSellerDao();
    }
}
