import java.util.ArrayList;

class Hospital {
    String hospitalName;
    ArrayList<Doctor> doctors;
    ArrayList<Patient> patients;

    Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
        doctors = new ArrayList<>();
        patients = new ArrayList<>();
    }

    void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    void addPatient(Patient patient) {
        patients.add(patient);
    }

    void showDetails() {
        System.out.println("Hospital: " + hospitalName);
        System.out.println("Doctors: ");
        for (Doctor doctor : doctors) {
            System.out.println(doctor.name);
        }
        System.out.println("Patients: ");
        for (Patient patient : patients) {
            System.out.println(patient.name);
        }
    }
}

class Doctor {
    String name;
    int id;

    Doctor(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void consult(Patient patient) {
        System.out.println(name + " is consulting with " + patient.name);
    }
}

class Patient {
    String name;
    int id;

    Patient(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void consultDoctor(Doctor doctor) {
        doctor.consult(this);
    }
}

public class HospitalSystem {
    public static void main(String[] args) {
        Hospital hospital = new Hospital("City Hospital");

        Doctor doctor1 = new Doctor("Dr. Smith", 101);
        Doctor doctor2 = new Doctor("Dr. Johnson", 102);

        Patient patient1 = new Patient("John Doe", 201);
        Patient patient2 = new Patient("Alice White", 202);

        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);

        hospital.addPatient(patient1);
        hospital.addPatient(patient2);

        hospital.showDetails();

        patient1.consultDoctor(doctor1);
        patient2.consultDoctor(doctor2);
        patient1.consultDoctor(doctor2); // Showing communication with multiple doctors
    }
}
