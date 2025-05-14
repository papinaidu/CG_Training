import java.time.LocalDate;
import java.util.*;


class InsurancePolicy implements Comparable<InsurancePolicy> {
   private int policyNumber;
   private String policyholderName;
   private LocalDate expiryDate;
   private String coverageType;
   private int premiumAmount;

   public InsurancePolicy(int policyNumber, String policyholderName, LocalDate expiryDate, String coverageType, int premiumAmount) {
       this.policyNumber = policyNumber;
       this.policyholderName = policyholderName;
       this.expiryDate = expiryDate;
       this.coverageType = coverageType;
       this.premiumAmount = premiumAmount;
   }

   public int getNum() {
       return policyNumber;
   }

   public String getName() {
       return policyholderName;
   }

   public LocalDate getDate() {
       return expiryDate;
   }

   public String getCoverageType() {
       return coverageType;
   }

   public int getPremiumAmount() {
       return premiumAmount;
   }

   public void display() {
       System.out.println(this);
   }

  
  
   public int compareTo(InsurancePolicy other) {
       return this.expiryDate.compareTo(other.expiryDate);
   }
  
  
   public boolean equals(Object obj) {
       if (this == obj) return true;
       if (!(obj instanceof InsurancePolicy)) return false;
       InsurancePolicy other = (InsurancePolicy) obj;
       return this.policyNumber == other.policyNumber;
   }
  
   public int hashCode() {
       return Objects.hash(policyNumber);
   }

  
   public String toString() {
       return "Policy Number: " + policyNumber +
               " | Policyholder: " + policyholderName +
               " | Expiry: " + expiryDate +
               " | Coverage: " + coverageType +
               " | Premium: " + premiumAmount;
   }
}

class PolicyManager {
   Set<InsurancePolicy> hashSet = new HashSet<>();
   Set<InsurancePolicy> linkedHashSet = new LinkedHashSet<>();
   Set<InsurancePolicy> treeSet = new TreeSet<>();
   Set<Integer> duplicatePolicyNumbers = new HashSet<>();

   public void addPolicy(InsurancePolicy policy) {
       if (!hashSet.add(policy)) {
           duplicatePolicyNumbers.add(policy.getNum());
       }
       linkedHashSet.add(policy);
       treeSet.add(policy);
   }

   public void displayAllPolicies() {
       System.out.println("=== All Unique Policies ===");
       for (InsurancePolicy p : hashSet) {
           p.display();
       }
   }

   public void displayPoliciesExpiringSoon() {
       System.out.println("=== Policies Expiring Within 30 Days ===");
       LocalDate now = LocalDate.now();
       LocalDate in30Days = now.plusDays(30);
       for (InsurancePolicy p : treeSet) {
           if (!p.getDate().isAfter(in30Days)) {
               p.display();
           }
       }
   }

   public void displayPoliciesByCoverage(String coverageType) {
       System.out.println("=== Policies with Coverage: " + coverageType + " ===");
       for (InsurancePolicy p : hashSet) {
           if (p.getCoverageType().equalsIgnoreCase(coverageType)) {
               p.display();
           }
       }
   }

   public void displayDuplicatePolicies() {
       System.out.println("=== Duplicate Policy Numbers ===");
       for (int num : duplicatePolicyNumbers) {
           System.out.println("Duplicate Policy Number: " + num);
       }
   }
}


public class Main {
   public static void main(String[] args) {
       PolicyManager manager = new PolicyManager();

       manager.addPolicy(new InsurancePolicy(101, "Alice", LocalDate.now().plusDays(15), "Health", 1200));
       manager.addPolicy(new InsurancePolicy(102, "Bob", LocalDate.now().plusDays(40), "Auto", 800));
       manager.addPolicy(new InsurancePolicy(103, "Charlie", LocalDate.now().plusDays(5), "Home", 1000));
       manager.addPolicy(new InsurancePolicy(101, "Alice", LocalDate.now().plusDays(15), "Health", 1200)); // duplicate

       manager.displayAllPolicies();
       manager.displayPoliciesExpiringSoon();
       manager.displayPoliciesByCoverage("Health");
       manager.displayDuplicatePolicies();
   }
}