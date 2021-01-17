package ImageHoster;

import ImageHoster.model.ImageFile;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by vaibhavhajela on 16/01/21.
 */
public interface ImageFileRepository extends JpaRepository<ImageFile,String>{
}
