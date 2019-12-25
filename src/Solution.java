class Solution {
    static String whoLikesIt(String... names) {

        int totalLiked = names.length; //get length of array

        String popUpMessage = "Something went wrong";

        if (totalLiked == 0) {                  // if length is 0
            popUpMessage = "no one likes this"; // no one likes this
        } else if (totalLiked == 1) {   //else if length is 1
            popUpMessage = names[0] + " likes this";
        } else if (totalLiked == 2) {   // else if length is 2
            popUpMessage = names[0] + " and " + names[1] + " like this";
        } else if (totalLiked == 3) {   // else if length is 3
            popUpMessage = names[0] + ", " + names[1] + " and " + names[2] + " like this";
        } else if (totalLiked >= 4) {    // else if length is > 3

            popUpMessage = names[0] + ", " + names[1] + " and " + (names.length - 2) + " others" + " like this"; // smb1, smb2 and (length-2) others like this

        }

        return popUpMessage;
    }
}
