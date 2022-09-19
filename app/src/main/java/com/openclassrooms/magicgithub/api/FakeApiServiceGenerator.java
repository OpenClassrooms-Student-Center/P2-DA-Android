package com.openclassrooms.magicgithub.api;

import com.openclassrooms.magicgithub.model.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public abstract class FakeApiServiceGenerator {


    static List<User> generateUsers() {
        return new ArrayList<>(FAKE_USERS);
    }

    public static List<User> FAKE_USERS = Arrays.asList(
            new User("001", "Jake", "https://avatars.dicebear.com/api/miniavs/1.png"),
            new User("002", "Paul", "https://avatars.dicebear.com/api/miniavs/2.png"),
            new User("003", "Phil", "https://avatars.dicebear.com/api/miniavs/3.png"),
            new User("004", "Guillaume", "https://avatars.dicebear.com/api/miniavs/4.png"),
            new User("005", "Francis", "https://avatars.dicebear.com/api/miniavs/5.png"),
            new User("006", "George", "https://avatars.dicebear.com/api/miniavs/6.png"),
            new User("007", "Louis", "https://avatars.dicebear.com/api/miniavs/7.png"),
            new User("008", "Mateo", "https://avatars.dicebear.com/api/miniavs/8.png"),
            new User("009", "April", "https://avatars.dicebear.com/api/miniavs/9.png"),
            new User("010", "Louise", "https://avatars.dicebear.com/api/miniavs/10.png"),
            new User("011", "Elodie", "https://avatars.dicebear.com/api/miniavs/11.png"),
            new User("012", "Helene", "https://avatars.dicebear.com/api/miniavs/12.png"),
            new User("013", "Fanny", "https://avatars.dicebear.com/api/miniavs/13.png"),
            new User("014", "Laura", "https://avatars.dicebear.com/api/miniavs/14.png"),
            new User("015", "Gertrude", "https://avatars.dicebear.com/api/miniavs/15.png"),
            new User("016", "Chloé", "https://avatars.dicebear.com/api/miniavs/16.png"),
            new User("017", "April", "https://avatars.dicebear.com/api/miniavs/17.png"),
            new User("018", "Marie", "https://avatars.dicebear.com/api/miniavs/18.png"),
            new User("019", "Henri", "https://avatars.dicebear.com/api/miniavs/19.png"),
            new User("020", "Rémi", "https://avatars.dicebear.com/api/miniavs/20.png")
    );

    public static List<User> FAKE_USERS_RANDOM = Arrays.asList(
            new User("021", "Lea", "https://avatars.dicebear.com/api/miniavs/21.png"),
            new User("022", "Geoffrey", "https://avatars.dicebear.com/api/miniavs/22.png"),
            new User("023", "Simon", "https://avatars.dicebear.com/api/miniavs/23.png"),
            new User("024", "André", "https://avatars.dicebear.com/api/miniavs/24.png"),
            new User("025", "Leopold", "https://avatars.dicebear.com/api/miniavs/25.png")
    );
}
