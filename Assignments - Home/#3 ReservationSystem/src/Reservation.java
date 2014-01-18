import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;



public class Reservation {

    public static List<ReservationData> listOfReservations = new ArrayList<ReservationData>();


    public void whatDoYouWantToDo(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Do you want to make a reservation (M), cancel a reservation (C) or list all reservations (L)? ");
        String request = scanner.next();
        if (request.equals("M")) {
            makeReservation();
        }
        else if (request.equals("C")) {
            cancelReservation();
        }
        else if (request.equals("L")) {
            listAllReservations();
        }
        else {
            System.out.println("Whoops! I didn't understand what you were asking me. ");
            whatDoYouWantToDo();
        }
    }

    public void listAllReservations(){
        if (listOfReservations.size() != 0) {

            // TODO: order by reservation time

            System.out.println("Here are all the current reservations: ");
            for (int i=0; i < listOfReservations.size(); i++) {
                System.out.println("RESERVATION #" + (i+1));
                System.out.println("Type: " + (listOfReservations.get(i)).getResType());
                System.out.println("Name: " + (listOfReservations.get(i)).getName());
                System.out.println("Reservation time: " + (listOfReservations.get(i)).getTime());
                System.out.println("Number of seats: " + (listOfReservations.get(i)).getNumPeople());
                if (listOfReservations.get(i).getPhoneNumber().equals("")) {
                    // do nothing
                }
                else {
                    System.out.println("Reservation made at: " + (listOfReservations.get(i)).getCurrentTime());
                    System.out.println("Phone: " + (listOfReservations.get(i)).getPhoneNumber());
                    System.out.println("Source: " + (listOfReservations.get(i)).getWebsite());
                }
                System.out.println(" ");
            }
            System.out.println(" ");
            System.out.println(" ");
            whatDoYouWantToDo();
        }
        else {
            System.out.println("No reservation have been made. ");
            System.out.println(" ");
            whatDoYouWantToDo();
        }
    }



    public void makeReservation(){
        Scanner scanner = new Scanner(System.in);
        int totalPeople = 0;
        System.out.println("Hello. Let's make a new reservation. ");
        System.out.println("What type of reservation would you like to make? Via internet (WEB), phone (RING) or in person (BLAH)? ");
        String resTypeAnswer = scanner.next();
        if (resTypeAnswer.equals("WEB")) {
            String resType = "Internet";
            int idNum = listOfReservations.size()+ 1;
            System.out.print("What time did you want to come? (e.g: 7pm)? ");
            String time = scanner.next();
            System.out.print("What name do you want to make the reservation under? ");
            String name = scanner.next();
            System.out.print("How many people will be at your table? ");
            int numPeople = scanner.nextInt();
            System.out.print("Source website? ");
            String website = scanner.next();
            System.out.print("What is your phone number? ");
            String phoneNumber = scanner.next();
            System.out.print("What is the current time? (e.g: 7:56pm) ");
            String currentTime =  scanner.next();

            // count how many people already at that time
            for (int i=0; i < listOfReservations.size(); i++) {
                if (listOfReservations.get(i).getTime().equals(time)) {
                    totalPeople = totalPeople + numPeople;
                }
            }

            if (totalPeople+numPeople <= 50) {
                ReservationData newRes = new ReservationData(name, time, numPeople, website, resType, currentTime, phoneNumber, idNum);
                newRes.setName(name);
                newRes.setNumPeople(numPeople);
                newRes.setPhoneNumber(phoneNumber);
                newRes.setWebsite(website);
                newRes.setTime(time);
                newRes.setResType(resType);
                newRes.setCurrentTime(currentTime);
                newRes.setIdNum(idNum);

                listOfReservations.add(newRes);
                System.out.println("Your reservation is confirmed. ");
                whatDoYouWantToDo();
            }
            else {
                System.out.println("Sorry, the restaurant is full at " + time + ". Try a different time. ");
                whatDoYouWantToDo();
                // TODO BONUS: offer a different reservation time
            }

            // TODO BONUS: check that in person reservation + number of empty seats is >= 10
            // if full, offer different reservation


        }
        else if (resTypeAnswer.equals("RING")) {
            String resType = "Phone";
            int idNum = listOfReservations.size()+ 1;
            System.out.print("What time did you want to come? (e.g: 7pm)? ");
            String time = scanner.next();
            System.out.print("What name do you want to make the reservation under? ");
            String name = scanner.next();
            System.out.print("How many people will be at your table? ");
            int numPeople = scanner.nextInt();
            System.out.print("What is your phone number? ");
            String phoneNumber = scanner.next();
            String website = "";
            String currentTime =  "";

            // count how many people already at that time
            for (int i=0; i < listOfReservations.size(); i++) {
                if (listOfReservations.get(i).getTime().equals(time)) {
                    totalPeople = totalPeople + numPeople;
                }
            }

            if (totalPeople+numPeople <= 50) {
                ReservationData newRes = new ReservationData(name, time, numPeople, website, resType, currentTime, phoneNumber, idNum);
                newRes.setName(name);
                newRes.setNumPeople(numPeople);
                newRes.setPhoneNumber(phoneNumber);
                newRes.setWebsite(website);
                newRes.setTime(time);
                newRes.setResType(resType);
                newRes.setCurrentTime(currentTime);
                newRes.setIdNum(idNum);

                listOfReservations.add(newRes);
                System.out.println("Your reservation is confirmed. ");
                whatDoYouWantToDo();
            }
            else {
                System.out.println("Sorry, the restaurant is full at " + time + ". Try a different time. ");
                whatDoYouWantToDo();
                // TODO BONUS: offer a different reservation time
            }

            // TODO BONUS: check that in person reservation + number of empty seats is >= 10
            // if full, offer different reservation

        }
        else if (resTypeAnswer.equals("BLAH")) {
            String resType = "In Person";
            int idNum = listOfReservations.size()+ 1;
            System.out.print("What time did you want to come? (e.g: 7pm)? ");
            String time = scanner.next();
            System.out.print("What name do you want to make the reservation under? ");
            String name = scanner.next();
            System.out.print("How many people will be at your table? ");
            int numPeople = scanner.nextInt();
            String phoneNumber = "";
            String website = "";
            String currentTime =  "";

            // count how many people already at that time
            for (int i=0; i < listOfReservations.size(); i++) {
                if (listOfReservations.get(i).getTime().equals(time)) {
                    totalPeople = totalPeople + numPeople;
                }
            }

            if (totalPeople+numPeople <= 50) {
                ReservationData newRes = new ReservationData(name, time, numPeople, website, resType, currentTime, phoneNumber, idNum);
                newRes.setName(name);
                newRes.setNumPeople(numPeople);
                newRes.setPhoneNumber(phoneNumber);
                newRes.setWebsite(website);
                newRes.setTime(time);
                newRes.setResType(resType);
                newRes.setCurrentTime(currentTime);
                newRes.setIdNum(idNum);

                listOfReservations.add(newRes);
                System.out.println("Your reservation is confirmed. ");
                whatDoYouWantToDo();
            }
            else {
                System.out.println("Sorry, the restaurant is full at " + time + ". Try a different time. ");
                whatDoYouWantToDo();
                // TODO BONUS: offer a different reservation time
            }

            // TODO BONUS: check that in person reservation + number of empty seats is >= 10
            // if full, offer different reservation

        }
        else {
            System.out.println("Whoops. I didn't understand. ");
            makeReservation();
        }

    }


    public void cancelReservation(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Let's cancel a reservation.");
        System.out.println("Under which name did you make your reservation? ");
        String theName = scanner.next();
        System.out.println("What time was your reservation made for? ");
        String theTime = scanner.next();
        for (int i=0; i < listOfReservations.size(); i++) {
            if ( (listOfReservations.get(i).getName().equals(theName)) && (listOfReservations.get(i).getTime().equals(theTime) )) {
                listOfReservations.remove(i);
                System.out.println("Your reservation for "+ theTime +" has been canceled. ");
            }
            else {
                System.out.println("Sorry, we didn't find a match.");
                whatDoYouWantToDo();
            }
        }
    }

    public class ReservationData {
        private String name;
        private String time;
        private int numPeople;
        private String website;
        private String resType;
        private String currentTime;
        private String phoneNumber;
        private int idNum;

        public ReservationData(String name, String time, int numPeople, String website, String resType, String currentTime, String phoneNumber, int idNum) {
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

        public String getTime() {
            return this.time;
        }

        public void setTime(String time) {
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

        public String getCurrentTime() {
            return this.currentTime;
        }

        public void setCurrentTime(String currentTime) {
            this.currentTime = currentTime;
        }

        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public int getIdNum() {
            return this.idNum;
        }

        public void setIdNum(int idNum) {
            this.idNum = idNum;
        }


    }

}
