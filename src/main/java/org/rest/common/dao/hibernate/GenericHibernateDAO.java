package org.rest.common.dao.hibernate;

import java.io.Serializable;

import org.rest.common.dao.IGenericDAO;

// @Repository
public class GenericHibernateDAO< T extends Serializable > extends AbstractHibernateDAO< T > implements IGenericDAO< T >{
	
	public GenericHibernateDAO(){
		super();
	}
	
}
