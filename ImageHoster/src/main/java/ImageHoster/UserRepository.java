package ImageHoster;

import ImageHoster.model.ImageFile;
import ImageHoster.model.User;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.util.List;

/**
 * Created by vaibhavhajela on 16/01/21.
 */
@Repository
public class UserRepository {


    @PersistenceUnit(unitName = "techblog")
    private EntityManagerFactory emf ;//= JpaConfig.entityManagerFactory();

    public List<User> getAllUsers() {
        EntityManager em = emf.createEntityManager();
        TypedQuery<User> query = em.createQuery("SELECT p from User p", User.class);
        List<User> resultList = query.getResultList();

        return resultList;
    }

    public User createPost(User image) {

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
}
