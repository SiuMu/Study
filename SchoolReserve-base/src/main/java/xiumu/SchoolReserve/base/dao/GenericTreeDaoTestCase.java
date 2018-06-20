package xiumu.SchoolReserve.base.dao;

import xiumu.SchoolReserve.base.domain.BaseTreeEntity;

import java.io.Serializable;

/**
 * 
 * @author sum
 *
 * @param <PK>
 * @param <T>
 * @param <M>
 */
public class GenericTreeDaoTestCase<PK extends Serializable, T extends BaseTreeEntity<T>, M extends GenericTreeDao<T, PK>>
		extends GenericDaoTestCase<PK, T, M> {

}
