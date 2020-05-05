package OOPInterface;

public class TestHospital {

	public static void main(String[] args) {
		
		//cannot create the object of interface
		
		FortisHospital fs = new FortisHospital();
		
		fs.cardioServices();
		fs.orthoServices();
		fs.emergencyServices();
		fs.medicalInsuranceServices();
		fs.virusVaccination();
		fs.pandemicServices();
		fs.polioServices();
		fs.birthControl();
		
		USMedical.bloodBank();
		System.out.println(USMedical.min_fee);
		
		USMedical us = new FortisHospital();//child class object can be referred by parent class Interface; Top casting
		
		us.orthoServices();
		us.NineOneOneServices();
		us.ENTServices();
		us.physioServices();
		us.birthControl();
		
		//reference check - will not allow to access the methods coming from UKMedical Interface with USMedical us reference variable
		
		IndianMedical im = new FortisHospital();
		im.cardioServices();
		im.OPTServices();
		im.pathologyServices();
		im.physioServices();
		
		
	}

}
