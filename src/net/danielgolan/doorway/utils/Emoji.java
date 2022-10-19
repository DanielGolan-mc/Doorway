package net.danielgolan.doorway.utils;

public record Emoji(Snowflake snowflake, String name, DiscordObject[] roles, DiscordObject user, boolean require_colons, boolean managed, boolean animated, boolean available) implements DiscordObject {
    public Emoji(Snowflake snowflake, String name) {
        this(snowflake, name, false);
    }

    public Emoji(Snowflake snowflake, String name, boolean animated) {
        this(snowflake, name, null, null, true, false, animated, true);
    }
}
