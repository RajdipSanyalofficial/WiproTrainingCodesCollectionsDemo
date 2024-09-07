/**
 * Since LinkedHashSet allows you to quickly check for the existence of an entry and also stores order,
 *  *  *   this collection seems to be quite convenient for eliminating duplicates from a list.
 *  *  *   Or, for example, solving problems like the last recently seen item in my bag.
 *  *  *   Or, remember such a game, Pokemon Go? LinkedHashSet can store a list of Pokémon you've encountered and the order
 *  *  *   in which they came across on your path. In this case, the “repeated” Pokémon will no longer be added to the list.
 *  *  *   Or, for example, a list of bosses by level that you have already met in any game with levels. Or the history of the discovery of cosmic bodies.
 *  *  *   LinkedHashSet allows you to quickly check whether a space body is already in the list or not, and if it is not there, then add it to the list.
 *  *  *   Let's take an example of eliminating duplicates.
 */

package collectionsdemo;

import java.util.*;

public class LinkedHashSetDemo2 {
    public static void main(String[] args) {
        List<String> listWithDuplicates = List.of("some","elements","with", "few", "duplicates", "were", "here", "duplicates", "duplicates");

        Set<String> linkedHashSet = new LinkedHashSet<>(listWithDuplicates);
        List<String> listWithoutDuplicates = new ArrayList<>(linkedHashSet);

        // next will print:
        // > listWithDuplicates = [some, elements, with, few, duplicates, here, duplicates, duplicates]
        System.out.println("listWithDuplicates = " + listWithDuplicates);
        // next will print:
        // > listWithoutDuplicates = [some, elements, with, few, duplicates, here]
        System.out.println("listWithoutDuplicates = " + listWithoutDuplicates);

        // -------------------------------------------------------------------------

        // while using regular Hash Set will generally produces some unexpected order
        Set<String> regularHashSet = new HashSet<>(listWithDuplicates);

        // next will print:
        // > linkedHashSet = [some, elements, with, few, duplicates, were, here]
        System.out.println("linkedHashSet = " + linkedHashSet);
        // next will print:
        // > regularHashSet = [here, some, with, duplicates, were, elements, few]
        System.out.println("regularHashSet = " + regularHashSet);
    }
}

