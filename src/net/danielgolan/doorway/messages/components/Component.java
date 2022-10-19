package net.danielgolan.doorway.messages.components;

public sealed class Component implements Cloneable permits Button, Select {
    /**
     * This is the placeholder text of a select, the label of a button, or the title of a text input.
     */
    private final String label;
    /**
     * doesn't apply in modals
     */
    private final boolean disabled;

    protected Component(String label) {
        this(label, false);
    }

    protected Component(String label, boolean disabled) {
        this.label = label;
        this.disabled = disabled;
    }

    public String getLabel() {
        return label;
    }

    public boolean isDisabled() {
        return disabled;
    }

    @Override
    public Component clone() {
        try {
            return (Component) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
