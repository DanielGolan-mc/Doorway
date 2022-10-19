package net.danielgolan.doorway.messages.components;

import net.danielgolan.doorway.utils.Emoji;

public sealed class Button extends Component permits InteractionButton, LinkButton {
    private final Emoji icon;
    protected Button(String text, Emoji icon) {
        super(text);
        this.icon = icon;
    }

    public Emoji getIcon() {
        return icon;
    }

    public enum Color {
        Blurple, Grey, Green, Red
    }

    @Override
    public String toString() {
        if (this instanceof LinkButton button) {
            return """
                   {
                        "type": 2,
                        "style": 5,
                        "label": "%s",
                        "url": "%s",
                        "disabled": %b
                   }
                   """.formatted(button.getLabel(), button.getAddress(), button.isDisabled());
        } else if (this instanceof InteractionButton button) {
            return """
                   {
                        "type": 2,
                        "style": %d,
                        "label": "%s",
                        "custom_id": "%s",
                        "disabled": %b
                   }
                   """.formatted(button.getColor().ordinal() + 1, button.getLabel(), button.getIdentifier(), button.isDisabled());
        } else throw new IllegalAccessError("This class is sealed. Who the hell successfully added another dependency? Please visit https://discord.com/jobs for more info.");
    }
}
