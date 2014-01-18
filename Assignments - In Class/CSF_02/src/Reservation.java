/**
 * Created with IntelliJ IDEA.
 * User: marine
 * Date: 12/21/13
 * Time: 5:02 PM
 * To change this template use File | Settings | File Templates.
 */
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
//import java.util.Date;
//import java.text.DateFormat;
//import java.text.SimpleDateFormat;


public class Reservation {


    public static List<ReservationData> listOfReservations = new ArrayList<ReservationData>();
    public static ReservationData res;

    public void main(String[] args){
        whatDoYouWantToDo();
    }


    public class ReservationData {
        private String name;
        private int time;
        private int numPeople;
        private String website;
        private String resType;
        private int currentTime;
        private int phoneNumber;
        private int idNum;

        public ReservationData(String name, int time, int numPeople, String website, String resType, int currentTime, int phoneNumber, int idNum) {
            this.name = name;
            this.time = time;
            this.numPeople = numPeople;
            this.website = website;
            this.resType = resType;
            this.currentTime = currentTime;
            this.phoneNumber = phoneNumber;
            this.idNum = idNum;
        }

        public String getName() {
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getTime() {
            return this.time;
        }

        public void setTime(int time) {
            this.time= time;
        }

        public int getNumPeople() {
            return this.numPeople;
        }

        public void setNumPeople(int numPeople) {
            this.numPeople = numPeople;
        }

        public String getWebsite() {
            return this.website;
        }

        public void setWebsite(String website) {
            this.website = website;
        }

        public String getResType() {
            return this.resType;
        }

        public void setResType(String resType) {
            this.resType = resType;
        }

        public int getCurrentTime() {
            return this.currentTime;
        }

        public void setCurrentTime(int currentTime) {
            this.currentTime = currentTime;
        }

        public int getPhoneNumber() {
            return this.phoneNumber;
        }

        public void setPhoneNumber(int phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public int getIdNum() {
            return this.idNum;
        }

        public void setIdNum(int idNum) {
            this.idNum = idNum;
        }


        public String listAllReservations(){
            System.out.print("Here are all the current reservations: ");
            // here we list all the reservation requests
            // ordered by reservation time
            // should have: time, names, # of people, type of reservation, additional info
            for (int i=0; i < listOfReservations.size(); i++) {
                System.out.println(listOfReservations.get(i));
            }
            System.out.print("Done. ");
        }

    }


    public void whatDoYouWantToDo(){
        // do you want to make a request, remove a reservation or list all reservations?
        Scanner scanner = new Scanner(System.in);
        System.out.print("Do you want to make a reservation (R), cancel a reservation (C) or list all reservations (L)? ");
        String request = scanner.next();
        if (request.equals("R")) {
            makeReservation();
        }
        else if (request.equals("C")) {
            cancelReservation();
        }
        else if (request.equals("L")) {
            ReservationData.listAllReservations();
        }
        else {
            System.out.print("Whoops! I didn't understand what you were asking me. ");
            //whatDoYouWantToDo();
        }
    }



    public static void cancelReservation(){
        System.out.print("Cancel Reservation");
        // Ask for name of reservation, and time of reservation
        // Match in database and remove

        // Print a confirmation that the reservation has been removed
        System.out.print("Your reservation has been canceled. ");
    }

    public void makeReservation(){

        System.out.print("Hello. Let's make a new reservation. ");
        // here we accept a new reservation
        // first ask what type of reservation you want to make
        Scanner scanner = new Scanner(System.in);
        System.out.print("What type of reservation would you like to make? Via internet (WEB), phone (RING) or in person (BLAH)? ");
        String resTypeAnswer = scanner.next();
        if (resTypeAnswer.equals("WEB")) {

            // ask time/name/numberOfPeople  + Source website, Phone number, Time reserved
            // and store it in variables
            String resType = "Internet";
            int idNum = listOfReservations.size()+ 1;
            System.out.print("What time did you want to come? (7 for 7pm)? ");
            int time = scanner.nextInt();
            System.out.print("What name do you want to make the reservation under? ");
            String name = scanner.next();
            System.out.print("How many people will be at your table? ");
            int numPeople = scanner.nextInt();
            System.out.print("Source website? ");
            String website = scanner.next();
            System.out.print("What is your phone number? ");
            int phoneNumber = scanner.nextInt();
            System.out.print("What is the current time? (756 for 7:56pm) ");
            int currentTime =  scanner.nextInt();

            // TODO: check that numberOfPeople + total number of people reservation + empty seats <= 50
            // if full, offer different reservation


            // TODO: check that in person reservation + number of empty seats is >= 10
            // if full, offer different reservation

            // TODO: add stuff to reservation thing

            ReservationData hello = new ReservationData(name, time, numPeople, website, resType, currentTime, phoneNumber, idNum);
            hello.setName(name);
            hello.setNumPeople(numPeople);
            hello.setPhoneNumber(phoneNumber);
            hello.setWebsite(website);
            hello.setTime(time);
            hello.setResType(resType);
            hello.setCurrentTime(currentTime);
            hello.setIdNum(idNum);

            listOfReservations.add(hello);
            //res = new ReservationData(name, time, numPeople, website, resType, currentTime, phoneNumber);
            //listOfReservations.add(res);

            // Print a confirmation that reservation has been added
            System.out.print("Your reservation is confirmed. ");

        }
        else if (resTypeAnswer.equals("RING")) {
            // ask time/name/numberOfPeople
            // for phone number
            // check that numberOfPeople + total number of people reservation + empty seats <= 50
            // if full, offer different reservation
            // check that in person reservation + number of empty seats is >= 10
            // if full, offer different reservation
            // add stuff to reservation thing
            // Print a confirmation that reservation has been added

        }
        else if (resTypeAnswer.equals("BLAH")) {
            // ask time/name/numberOfPeople
            // check that numberOfPeople + total number of people reservation + empty seats <= 50
            // if full, offer different reservation
            // add stuff to reservation thing
            // Print a confirmation that reservation has been added

        }
        else {
            System.out.print("Whoops. I didn't understand. ");
            makeReservation();
        }

    }

}
