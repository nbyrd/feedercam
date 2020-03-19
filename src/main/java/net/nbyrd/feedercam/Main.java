// TODO: This is a placeholder. It allows me to save the directory
//       structure in git.

package net.nbyrd.feedercam;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.io.PrintStream;

public final class Main {
    public static void main(String[] args) {
        final Main main = new Main(System.out, args);
        main.run();
    }

    private final PrintStream printer;
    private final String[] names;

    Main(@Nonnull PrintStream printer, @Nullable String[] names) {
        this.printer = printer;
        this.names = names;
    }

    void run() {
        final StringBuilder greetingBuilder = new StringBuilder("Hello ");
        if (this.names != null && this.names.length > 0) {
            greetingBuilder.append(String.join(", ", this.names));
            greetingBuilder.append("!");
        } else {
            greetingBuilder.append("World!");
        }

        printer.println(greetingBuilder.toString());
    }
}
