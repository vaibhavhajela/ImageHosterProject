package ImageHoster;

import ImageHoster.model.Image;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by vaibhavhajela on 16/01/21.
 */
public interface ImageBootRepository extends JpaRepository<Image,String>{

}
