package nl.loxia.builder.generator.ap.test;

/**
 * Generated by RIGD-Loxia Builder generator
 */
public class SimpleClassAllFieldsInSetterBuilder<PARENT> {
    private boolean booleanField;
    private String stringField;

    private PARENT parent;

    public SimpleClassAllFieldsInSetterBuilder() {
    }

    public SimpleClassAllFieldsInSetterBuilder(PARENT parent) {
        this.parent = parent;
    }

    public SimpleClassAllFieldsInSetterBuilder<PARENT> withBooleanField(boolean booleanField) {
        this.booleanField = booleanField;
        return this;
    }

    public SimpleClassAllFieldsInSetterBuilder<PARENT> withStringField(String stringField) {
        this.stringField = stringField;
        return this;
    }

    public SimpleClassAllFieldsInSetter build() {
        SimpleClassAllFieldsInSetter result = new SimpleClassAllFieldsInSetter();
        result.setBooleanField(booleanField);
        result.setStringField(stringField);
        return result;
    }

    public PARENT end() {
        return parent;
    }

    public static SimpleClassAllFieldsInSetterBuilder<Void> copyOf(SimpleClassAllFieldsInSetter bron) {
        if (bron == null) {
            return null;
        }
        SimpleClassAllFieldsInSetterBuilder<Void> builder = new SimpleClassAllFieldsInSetterBuilder<>();
        builder.booleanField = bron.getBooleanField();
        builder.stringField = bron.getStringField();
        return builder;
    }

    public static <T> SimpleClassAllFieldsInSetterBuilder<T> copyOf(SimpleClassAllFieldsInSetter bron, T parentBuilder) {
        if (bron == null) {
            return null;
        }
        SimpleClassAllFieldsInSetterBuilder<T> builder = new SimpleClassAllFieldsInSetterBuilder<>(parentBuilder);
        builder.booleanField = bron.getBooleanField();
        builder.stringField = bron.getStringField();
        return builder;
    }
}
