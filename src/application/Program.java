package application;


import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;


import java.text.ParseException;
import java.time.Instant;
import java.util.Date;
import java.util.List;


public class Program {
    public static void main(String[] args) throws ParseException {

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("\n-----------------------Seller findById-------------------------");
        Seller seller = sellerDao.findById(2);
        System.out.println(seller);

        System.out.println("\n--------------------Seller findByDepartment-----------------------");
        List<Seller> list = sellerDao.findByDepartment(new Department(2, null));
        list.forEach(System.out::println);

        System.out.println("\n---------------------Seller Insert---------------------------------");
        Seller sellerInsert = new Seller(null, "Juras", "juras@gmail.com", new Date(), 20000D, new Department(2, null));
        //sellerDao.insert(sellerInsert);
        System.out.println("Done insert id = : " + sellerInsert.getId());

        System.out.println("\n---------------------Seller findAll--------------------------------");
        List<Seller> listAll = sellerDao.findAll();
        listAll.forEach(System.out::println);

        System.out.println("\n---------------------Seller Update--------------------------------");
        Seller sellerUpdate = sellerDao.findById(16);
        sellerUpdate.setName("Jurasndir");
        //sellerDao.update(sellerUpdate);
        System.out.println("Update Complete");
        System.out.println(sellerDao.findById(16));

        System.out.println("\n---------------------Seller Delete--------------------------------");
        sellerDao.deleteById(16);


    }
}
