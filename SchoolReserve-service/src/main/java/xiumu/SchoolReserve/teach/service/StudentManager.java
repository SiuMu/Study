package xiumu.SchoolReserve.teach.service;

import java.util.List;

import xiumu.SchoolReserve.base.service.GenericManager;
import xiumu.SchoolReserve.teach.domain.Student;
/**
 * 
 * @author sum
 *
 */
public interface StudentManager extends GenericManager<Student, Long> {

	/**
	 * get student list by given code
	 *
	 * @param code
	 * @return
	 */
	List<Student> findByCode(String code);

	/**
	 * 
	 * @param fullname
	 * @return
	 */
	List<Student> findByFullname(String fullname);
}
