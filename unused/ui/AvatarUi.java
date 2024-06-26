package ui;

//@@author NicholasTanYY-unused
// Unused and replaced with a much more concise version, found in src/main/java/ui/AvatarUi.java
// Reason: Previous implementation involved printing the appropriate avatar size based on
// the detected terminal size. However this feature was removed and hence this
// implementation was no longer relevant.
public class AvatarUi {
    
    private static final String LARGE_AVATAR = 
            "▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓████▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒\n" +
            "▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓█████▓▓▓▓▓▓▓▓███▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒\n" +
            "░░░░░░░░░░░░░░░░░░░░░░░░░░░▒▓███████▓▓▓▓▓▓▓▓▓██████▓▒░░░░░░░░░░░░░░░░░░░░░░░░░░░\n" +
            "░░░░░░░░░░░░░░░░░░░░░░░░░░▒██████▓▓▓▒▒▒▓▓▓▓████▓▓▓███▒░░░░░░░░░░░░░░░░░░░░░░░░░░\n" +
            "▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓████▓▓▓▓▓▓██▓███████▓▓▓▓██▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒\n" +
            "▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓█████████████████▓▓▓▓▓█▓▓███▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒\n" +
            "░░▒▒░░░░░░░░░░░░░░░░░░░░░▓█████▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓███▒░░░░░░░░░░░░░░░░░░▒▒░░▒▒▒\n" +
            "░░▒▒░░░░░░░░░░░░░░░░░░░░░▓████▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓████▓░░░░░░░░░░░░░░░░░░░▒▒░░▒▒░\n" +
            "░░▒▒░░░░░░░░░░░░░░░░░░░░░░████▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓████▒░░░░░░░░░░░░░░░░░░░▒▒░░▒▒░\n" +
            "░░▒▒░░░░░░░░░░░░░░░░░░░░░░████▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓███░░░░░░░░░░░░░░░░░░░░▒▒░░▒▒░\n" +
            "░░▒▒░░░░░░░░░░░░░░░░░░░░░░▓███▓▓▓▓████▒▒▒▓████▓▓▓▓██▓▒░░░░░░░░░░░░░░░░░░░▒▒░░▒▒░\n" +
            "░░▒▒░░░░░░░░░░░░░░░░░░░░░░▓██▓▒▓█▓▓▓▓▒▓▒▒▓▒▓▓▓▓▓▒▓██▓▒░░░░░░░░░░░░░░░░░░░▒▒░░▒▒░\n" +
            "░░▒▒░░░░░░░░░░░░░░░░░░░░░░▓▓█▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓██▓▒░░░░░░░░░░░░░░░░░░░▒░░░▒▒░\n" +
            "░░▒▒░░░░░░░░░░░░░░░░░░░░░░░▓▓█▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓█▓▒░░░░░░░░░░░░░░░░░░░░▒▒░░▒▒░\n" +
            "░░▒▒░░░░░░░░░░░░░░░░░░░░░░░░▒▓▓▓▒▒▒▒▒▒▓▒▒▓▒▒▒▒▒▓▓▓▓▒░░░░░░░░░░░░░░░░░░░░░▒▒░░▒▒░\n" +
            "░░▒▒░░░░░░░░░░░░░░░░░░░░░░░░░░▓▓▓▒▒▒▒▒▓▓▓▓▒▒▒▒▒▓▓▓░░░░░░░░░░░░░░░░░░░░░░░▒░░░▒▒░\n" +
            "░░▒▒░░░░░░░░░░░░░░░░░░░░░░░░░░▓▓▓▓▒▒▒▒▓▒▒▓▒▒▒▒▓▓▓▓░░░░░░░░░░░░░░░░░░░░░░░▒░░░▒▒░\n" +
            "░░▒▒░░░░░░░░░░░░░░░░░░░░░░░░░░▒▓▓▓▒▒▒▓▓▓▓▓▓▒▒▓▓▓▓░░░░░░░░░░░░░░░░░░░░░░░░▒░░░▒▒░\n" +
            "░░▒▒░░░░░░░░░░░░░░░░░░░░░░░░░░░██▓▓▒▒▒▒▒▒▒▒▒▒▓▓█▓░░░░░░░░░░░░░░░░░░░░░░░░▒░░░▒▒░\n" +
            "░░▒▒░░░░░░░░░░░░░░░░░░░░░░░░░░▒█▓▓█▓▓▒▒▒▒▒▒▓▓█▓▓▓░░░░░░░░░░░░░░░░░░░░░░░░▒▒░░▒▒░\n" +
            "░░▒▒░░░░░░░░░░░░░░░░░░░░░░░░░▓▓▓▓▓▓▓█▓▓▓▓▓██▓▒▒▓▒▓▒░░░░░░░░░░░░░░░░░░░░░░▒▒░░▒▒░\n" +
            "░░▒▒░░░░░░░▒░░░░░░░░░░░░░░░▒██▒▒▒▒▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▓██▒░░░░░░░░░░░░░░░░░░░░▒▒░░▒▒▒\n" +
            "░░▒▒░░░░▒▒▓▒▒▒▒▒░░░░░░░░▒▓████▒▒▒░░░▒▓▓▓▓▒▒▒░░░▒▒▒████▓▒░░░░░░░░░░░░░░░░░▒▒░░▒▒▒\n" +
            "░░▒▒░░▒▒▓▓▓▓▓▒░░░░░░▒▓▓███████▒▒░░░░░░▒▓▓▒░░░░░▒▒▒███████▓▓▒░░░░░░░░░░░░░▒▒░░▒▒░\n" +
            "▒▒▒▒░░░▒▓▓▓▓▒▒░▒▓▓██████████▓█▒▒░░░░▒██████░░░░░▒▒█▓██████████▓▓▓▒▒▒▒▒▒▒▒▒▒░░▒▒░\n" +
            "▓▓▓▓▒▒▒▒▓▓████████████████▓▓▓█▒▒░░░▒▒██████▒▒░░░▒▒█▓▓▓███████████████▓▓▓▓▓▒▒▒▒▒▒\n" +
            "▓▓▓▓▒▒▓██████████▓▓▓▓▓██▓▓▓▓▓█░░░░▒░░▒████░░░▒░░░▒█▓▓▓▓▓██▓▓▓▓▓▓███████████▓▓▓▒▒\n" +
            "▓▓▓▓█████████▓▓▓▓▓▓█▓▓▓▓▓▓▓▓▓█▒░░░░░░░████░░░░░░░▓█▓▓▓▓▓▓▓▓▓▓█▓▓▓▓▓▓████████▓▓▓▓\n" +
            "███▓███▓█▓▓▓▓▓▓▓▓▓▓█▓▓█▓▓▓▓▓▓█▓░░░░░░▓████▒░░░░░░██▓▓▓▓▓██▓▓█▓▓▓▓▓▓▓▓▓▓▓████▒▒▒▒\n" +
            "▒▒▒▒███▓█▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██░░░░░░█████▓░░░░░▒██▓▓▓▓▓▓▓▓▓█▓▓▓▓▓▓▓▓▓▓█▓███▓▓▓▓\n" +
            "▓▓▓▓████▓█▓▓▓▓▓▓▓▓▓▓█▓▓▓▓▓▓▓▓██▓░░░░░██████░░░░░▓██▓▓▓▓▓▓▓▓█▓▓▓▓▓▓▓▓▓▓▓██████▓██\n" +
            "████████▓██▓▓▓▓▓▓▓▓▓██▓▓▓▓▓▓▓██▓▒░░░▒██████▒░░░▒▓██▓▓▓▓▓▓▓▓█▓▓▓▓▓▓▓▓▓██▓█████▓▓▓\n" +
            "▓▓▓████████████▓▓▓▓▓▓██▓▓▓▓▓▓██▓▓░░░▓██████▒░░░▓▓██▓▓▓▓▓▓███▓▓▓▓▓▓▓███████████▓▓\n" +
            "░░░█████████████████▓██████████▓▓▓░░▓██████▓░░▓▓▓███████████████████████████████\n" +
            "▒▒▓█████████████████████████████▓▓▒░▓███████░▒█▓▓█████████████████████████████▓▓\n" +
            "█▓█████████████████████████████████▒▓███████░▓▓▓████████████▓▓▓▓▓█████████████▒▒\n" +
            "█▒██████████████████████████████████████████▓████████████▓▓▓▓█████████████████▓▒\n" +
            "█▒████████████████████████████████████████████████████████████████████████████▓▒\n" +
            "▓▓█████████████████████████████████████████████████████████████████████████████▒\n" +
            "▓▓█████████████████████████████████████████████████████████████████████████████▒\n";

    private static final String MEDIUM_AVATAR = 
            "▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒\n" + 
            "░░░░░░░░░░░░░░░░▒▒▓███▓▓▓▓▓▓▓█▓▓▒░░░░░░░░░░░░░░░░░\n" + 
            "░░░░░░░░░░░▒▒▒▒▒▓███▓▓▓▓▓▓███▓▓▓█▒▒▒▒▒▒▒░░░░░░░░░░\n" + 
            "▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒█████▓▓▓█▓▓▓▓▓▓██▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒\n" + 
            "░░░░░░░░░░░░░░░░███▓▒▒▒▒▒▒▒▒▒▒▓██▒░░░░░░░░░░░▒░░▒░\n" + 
            "░░░░░░░░░░░░░░░░███▓▒▒▒▒▒▒▒▒▒▒▓██░░░░░░░░░░░░░░░▒░\n" + 
            "░░░░░░░░░░░░░░░░▒█▓▓███▓▒▒▓██▓▓██░░░░░░░░░░░░░░░▒░\n" + 
            "░░░░░░░░░░░░░░░░▓█▓▒▒▒▒▒▒▒▒▒▒▒▒█▓░░░░░░░░░░░░░░░▒░\n" + 
            "░░░░░░░░░░░░░░░░░▓▓▓▒▒▒▒▒▒▒▒▒▒▓▓▒░░░░░░░░░░░░▒░░▒░\n" + 
            "░░░░░░░░░░░░░░░░░░▒▓▒▒▒▒▓▓▒▒▒▓▓░░░░░░░░░░░░░░▒░░▒░\n" + 
            "░░░░░░░░░░░░░░░░░░░▓▓▒▒▓▓▓▓▒▓▓▒░░░░░░░░░░░░░░▒░░▒░\n" + 
            "░░░░░░░░░░░░░░░░░░░▓▓▓▒▒▒▒▒▒▓▓░░░░░░░░░░░░░░░▒░░▒░\n" + 
            "░░░░░░░░░░░░░░░░░░▒▓▓▓▓▓▓▓▓▓▓▓▓░░░░░░░░░░░░░░▒░░▒░\n" + 
            "░▒░░░░░▒░░░░░░░░▒▓█▒▒▒▓▓▓▓▓▒▒▒▒█▓▒░░░░░░░░░░░▒░░▒░\n" + 
            "░▒░░▒▓▓▓▒░░░▒▒▓███▓▒░░░▒▓▓░░░▒▒████▓▒▒░░░░░░░▒░░▒░\n" + 
            "▓▓▒░▒▓▓▓▓▓▓██████▓▓▒░░▒████░░░▒█▓██████▓▓▓▓▓▒▒▒▒▒▒\n" + 
            "▓▓▓▓██████▓▓▓██▓▓▓▓░░░░▓██░░░░▒█▓▓▓█▓▓▓▓██████▓▓▓▒\n" + 
            "▓▓████▓▓▓▓▓▓█▓▓▓▓▓█░░░░▓██▒░░░▒█▓▓▓▓▓▓▓▓▓▓▓▓███▓▓▓\n" + 
            "▒▒▓███▓▓▓▓▓▓▓▓▓▓▓▓█▒░░░███▓░░░▓█▓▓▓▓▓▓▓▓▓▓▓▓▓███▓▓\n" + 
            "███████▓▓▓▓▓██▓▓▓▓█▓░░░████░░▒██▓▓▓▓█▓▓▓▓▓▓█████▓▓\n" + 
            "▒▒████████▓▓▓██▓▓▓█▓▓░▒████░░▓████▓██▓▓▓██████████\n" + 
            "▒▓██████████████████▓▒▒████▒▓▓█████████▓████████▓▓\n" + 
            "▓▓████████████████████▓████▓████████▓▓▓█████████▓▒\n" + 
            "▓████████████████████████████████████████████████▒\n" + 
            "▓████████████████████████████████████████████████▒\n";

    private static final String SMALL_AVATAR = 
            "░░░░▒▒▒▓▓▓▓▓▓▒▒▒░░░░\n" +
            "▒░░░░░▓█▓▓▓▓▓▒░░░░▒▒\n" +
            "░░░░░░▒▓▓▒▒▓█░░░░░░▒\n" +
            "░░░░░░░▓▒▒▒▒▓░░░░░░▒\n" +
            "░░░░░░░▒▓▒▒▓░░░░░░░▒\n" +
            "░░▒░░▒▓▓▒▓▓▒▓▒▒░░░░▒\n" +
            "▓▓█▓██▓▒░▓▓░▓▓██▓▓▓▒\n" +
            "▓█▓▓▓▓▓▓░▓▓░▓▓▓▓▓▓█▓\n" +
            "▓███████▒██▒███▓███▓\n" +
            "███████████████████▓\n";
            
    private static final String WELCOME_MESSAGE = "Hello there, I am CLI-nton, your CLI-based " + 
            "personal assistant in event management!";

    private enum AvatarSize {
        SMALL,
        MEDIUM,
        LARGE
    }

    /**
     * Calculates the width of the avatar based on the avatar string.
     * @param avatar The avatar string.
     * @return The width of the avatar in characters.
     */
    private static int getAvatarWidth(String avatar) {
        String[] lines = avatar.split("\n");
        return lines[0].length();
    }

    /**
     * Determines the size of the avatar to use.
     * @param terminalWidth Width of the terminal.
     * @return The appropriate avatar to use.
     */
    private static AvatarSize getAvatarSize(int terminalWidth) {
        if (terminalWidth < getAvatarWidth(MEDIUM_AVATAR)) {
            return AvatarSize.SMALL;
        } else if (terminalWidth < getAvatarWidth(LARGE_AVATAR)) {
            return AvatarSize.MEDIUM;
        } else {
            return AvatarSize.LARGE;
        }
    }

    /**
     * Prints the avatar to the terminal.
     */
    public static void printAvatar() {
        int terminalWidth = TerminalSize.getTerminalWidth();
        AvatarSize avatarSize = getAvatarSize(terminalWidth);
        String avatar = getAvatarImage(avatarSize);

        String[] lines = avatar.split("\n");
        int avatarWidth = lines[0].length();
        int avatarPadding = Math.max((terminalWidth - avatarWidth) / 2, 0);

        for (String line : lines) {
            System.out.print(" ".repeat(avatarPadding));
            System.out.println(line);
        }
    }

    /**
     * Retrieves the avatar string to use based on the required size.
     * @param avatarSize The size of the avatar.
     * @return The avatar string corresponding to the avatar size.
     */
    private static String getAvatarImage(AvatarSize avatarSize) {
        String avatar;
        switch (avatarSize) {
        case SMALL:
            avatar = SMALL_AVATAR;
            break;
        case MEDIUM:
            avatar = MEDIUM_AVATAR;
            break;
        default:
            avatar = LARGE_AVATAR;
        }
        return avatar;
    }

    /**
     * Prints a welcome message to the user.
     * It is centralized based on the width of the terminal.
     */
    public static void printWelcomeMessage() {
        int terminalWidth = TerminalSize.getTerminalWidth();
        int messagePadding = Math.max((terminalWidth - WELCOME_MESSAGE.length()) / 2, 0);
        System.out.print(" ".repeat(messagePadding));
        System.out.println("Hello there, I am CLI-nton, your CLI-based personal assistant in event management!");
    }
}
