package fr.demos.cineromev2.data;

import java.util.List;
import fr.demos.cineromev2.metier.*;



public interface CineRomeV2DAO {

	void sauve(ArticleCineRomeV2 Ar) throws Exception;
		List<ArticleCineRomeV2> rechercheTout () throws Exception;
		List<ArticleCineRomeV2> recherche (String critere) throws Exception;
		int nombre(String critere);
	}


