package model;

import org.orm.PersistentException;

import peristentmodel.*;

public abstract class AModel {

	APersistentModel model;
	
	public abstract APersistentModel getPersistentModel();
		
	public abstract void setPersistentModel(APersistentModel model);
	
}
