package DAO;

import java.util.ArrayList;
import java.util.List;

import model.Formation;

public interface IFormationDao {
	
	public int ajoutForm(Formation form);
	public List<Formation> listerForm();

}
