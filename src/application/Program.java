package application;


import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;


import java.text.ParseException;
import java.util.List;


public class Program {
    public static void main(String[] args) throws ParseException {
        SellerDao sellerDao = DaoFactory.createSellerDao();
        Seller seller = sellerDao.findById(2);
        System.out.println(seller);
        System.out.println("--------------------");
        List<Seller> list = sellerDao.findByDepartment(new Department(2, null));
        list.forEach(System.out::println);
    }
}
