import java.util.Map;
import java.util.HashMap;

public class Pharmacy {

    private Map<String, Medication> medications = new HashMap<>();

    public int getCount() {
        return medications.size();
    }

    public void save(Medication medication) {
        medications.put(medication.getName(), medication);
    }

    public Medication find(String medicationName) {
        return medications.get(medicationName);
    }

    public void delete(String medicationName) {
        medications.remove(medicationName);
    }

    public void printMedications() {
        for (Medication medication : medications.values()) {
            System.out.println(medication.getName() + " - Preis: " + medication.getPrice() + "€, Verfügbar: " + medication.isAvailable());
        }
    }
}
