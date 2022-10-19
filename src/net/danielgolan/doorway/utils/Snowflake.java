package net.danielgolan.doorway.utils;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.Date;

public record Snowflake(String value) {
    /**
     * @return snowflake creation time, in milliseconds since Epoch, the first second of 1975 (unix timestamp - ms)
     * @see #timestamp()
     * @see #discordEpochTimestamp()
     */
    public long epochTimestamp() {
        return discordEpochTimestamp() + 1420070400000L;
    }

    /**
     * @return snowflake creation time, in milliseconds since Discord Epoch, the first second of 2015 (unix timestamp - ms)
     * @see #timestamp()
     * @see #epochTimestamp()
     */
    public long discordEpochTimestamp() {
        return toLong() >> 22;
    }

    /**
     * @return snowflake creation time
     * @see Date
     * @see #epochTimestamp()
     * @see #discordEpochTimestamp()
     */
    @Contract(" -> new")
    public @NotNull Date timestamp() {
        return new Date(epochTimestamp());
    }

    public long internalWorkerID() {
        return (toLong() & 0x3E0000) >> 17;
    }

    public long internalProcessID() {
        return (toLong() & 0x1F000) >> 12;
    }

    /**
     * @return For every ID that is generated on that {@linkplain #internalProcessID() process}, this number is incremented
     */
    public long increment() {
        return toLong() & 0xFFF;
    }

    /**
     * @return snowflake as {@link Long}
     */
    public long toLong() {
        return Long.parseLong(value);
    }

    @Contract(pure = true)
    @Override
    public String toString() {
        return value;
    }

    @Contract("_ -> new")
    public static @NotNull Snowflake of(String value) {
        return new Snowflake(value);
    }
}
