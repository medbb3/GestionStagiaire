public class Main {

	public static void main(String[] arg) {

		Stagiaire stag1 = new Stagiaire("mohamed", "oiejk", 48);
		Stagiaire stag2 = new Stagiaire("mohamed1", "oiejdsk", 48);
		Stagiaire stag3 = new Stagiaire("mohamed2", "oiejsdk", 47);
		Stagiaire stag4 = new Stagiaire("mohamed3", "oiejsk", 48);
		Stagiaire stag5 = new Stagiaire("mohamed4", "oiezejk", 45);
		StagiaireDao.insert(stag1);
		StagiaireDao.insert(stag2);
		StagiaireDao.insert(stag3);
		StagiaireDao.insert(stag4);
		StagiaireDao.insert(stag5);

		System.out.println(StagiaireDao.read());

	}
}