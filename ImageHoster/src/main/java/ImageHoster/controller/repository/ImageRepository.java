package ImageHoster.controller.repository;

import ImageHoster.model.Image;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.util.List;

/**
 * Created by vaibhavhajela on 17/01/21.
 */
@Repository
public class ImageRepository {

    @PersistenceUnit(unitName = "techblog")
    private EntityManagerFactory emf ;

    public Image storeImage(Image image){
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();

        try {
            transaction.begin();
            em.persist(image);
            transaction.commit();
        }catch(Exception e) {
            transaction.rollback();
        }

        return image;

    }


    public List<Image> getAllImagesNative() {
        EntityManager em = emf.createEntityManager();
        TypedQuery<Image> query = em.createQuery("SELECT p from Image p", Image.class);
        List<Image> resultList = query.getResultList();

        return resultList;
    }
}
