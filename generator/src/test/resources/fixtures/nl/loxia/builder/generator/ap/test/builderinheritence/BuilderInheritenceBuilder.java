package nl.loxia.builder.generator.ap.test.builderinheritence;

/**
 * Generated by RIGD-Loxia Builder generator
 */
public class BuilderInheritenceBuilder<PARENT> extends BuilderInheritenceBaseBuilder<PARENT> {
    private int otherValue;
    private String value;

    public BuilderInheritenceBuilder() {
    }

    public BuilderInheritenceBuilder(PARENT parent) {
        super(parent);
    }

    public BuilderInheritenceBuilder<PARENT> withOtherValue(int otherValue) {
        this.otherValue = otherValue;
        return this;
    }

    @Override
    public BuilderInheritenceBuilder<PARENT> withValue(String value) {
        this.value = value;
        return this;
    }

    @Override
    public BuilderInheritence build() {
        BuilderInheritence result = new BuilderInheritence();
        result.setOtherValue(otherValue);
        result.setValue(value);
        return result;
    }

    public static BuilderInheritenceBuilder<Void> copyOf(BuilderInheritence bron) {
        if (bron == null) {
            return null;
        }
        BuilderInheritenceBuilder<Void> builder = new BuilderInheritenceBuilder<>();
        builder.otherValue = bron.getOtherValue();
        builder.value = bron.getValue();
        return builder;
    }

    public static <T> BuilderInheritenceBuilder<T> copyOf(BuilderInheritence bron, T parentBuilder) {
        if (bron == null) {
            return null;
        }
        BuilderInheritenceBuilder<T> builder = new BuilderInheritenceBuilder<>(parentBuilder);
        builder.otherValue = bron.getOtherValue();
        builder.value = bron.getValue();
        return builder;
    }
}
