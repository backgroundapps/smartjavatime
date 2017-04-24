package io.github.jonatasemidio.designpathern.builder.dzone;

/**
 * Created by jonatas.souza on 20/12/2016.
 Model for builder pattern training
 */
public class BankAccount {
    public static class Builder{
        private long accountNumber;
        private String owner;
        private String branch;
        private double balance;
        private double interestRate;

        public Builder (long accountNumber){
            this.accountNumber = accountNumber;
        }

        public Builder withOwner(String owner){
            this.owner = owner;
            return this;
        }

        public Builder atBranch(String branch){
            this.branch = branch;
            return this;
        }

        public Builder openingBalance(double balance){
            this.balance = balance;
            return this;
        }

        public Builder atRate(double interestRate){
            this.interestRate = interestRate;
            return this;
        }

        public BankAccount build(){
            BankAccount account = new BankAccount();
            account.accountNumber = this.accountNumber;
            account.owner = this.owner;
            account.branch = this.branch;
            account.balance = this.balance;
            account.interestRate = this.interestRate;
            return account;
        }
    }

    private long accountNumber;
    private String owner;
    private String branch;
    private double balance;
    private double interestRate;


    private BankAccount(){}

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber=" + accountNumber +
                ", owner='" + owner + '\'' +
                ", branch='" + branch + '\'' +
                ", balance=" + balance +
                ", interestRate=" + interestRate +
                '}';
    }

    public static void main(String[] args){

        BankAccount account = new BankAccount.Builder(1L)
                .withOwner("Merge")
                .atBranch("Springfield")
                .openingBalance(100)
                .atRate(2.5)
                .build();

        System.out.println(account.toString());

    }
}
