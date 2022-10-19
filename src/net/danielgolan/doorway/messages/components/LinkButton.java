package net.danielgolan.doorway.messages.components;

import net.danielgolan.doorway.utils.Emoji;

public final class LinkButton extends Button {
    private final String address;

    private LinkButton(String text, Emoji icon, String url) {
        super(text, icon);
        address = url;
    }

    public String getAddress() {
        return address;
    }
}
