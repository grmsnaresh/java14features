package com.grms.java14.features;

public class SwitchEnhancement {
    public static enum Month {
        JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUG, SEPT, NOVEMBER, DECEMBER
    }
    public static String getSeasonInIndiaOldApproach(Month month) {
        String season = "";
        switch (month) {
            case JANUARY:
                // perform other actions;
                season = "Winter";
                break;
            case FEBRUARY:
                // perform other actions;
                season = "Winter";
                break;
            case MARCH:
                //perform other actions;
                season = "Summer";
                break;
            case JUNE:
                //perform other actions
                season = "Monsoon";
                break;
            default:
                System.out.println("invalid month");
        }
        return season;
    }
    public static String getSeasonInIndiaNewApproach(Month month) {
        String season = "";
        season = switch (month) {
            case JANUARY,FEBRUARY ->  {
                System.out.println("inside jan & feb");
                //Other operations.
                yield "Winter";
            }
            case MARCH -> "Summer";
            case JUNE -> "Monsoon";
            default -> "default";
        };
        return season;
    }
    public static void main(String args[]) {
//        String season = getSeasonInIndiaOldApproach(Month.JUNE);
        String season = getSeasonInIndiaNewApproach(Month.FEBRUARY);
        System.out.println("season: "+season);
    }
}
