package application;


import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;


import java.text.ParseException;


public class Program {
    public static void main(String[] args) throws ParseException {
        SellerDao sellerDao = DaoFactory.createSellerDao();
        Seller seller = sellerDao.findById(2);
        System.out.println(seller);
    }
}
