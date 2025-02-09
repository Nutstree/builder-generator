package nl.loxia.builder.generator.ap.test.builderinheritence;

/**
 * Generated by RIGD-Loxia Builder generator
 */
public class BuilderInnerClassBuilder<PARENT> {
    private BuilderInnerClass.InnerClass value;
    private InnerClassBuilder<BuilderInnerClassBuilder<PARENT>> valueBuilder;

    private PARENT parent;

    public BuilderInnerClassBuilder() {
    }

    public BuilderInnerClassBuilder(PARENT parent) {
        this.parent = parent;
    }

    public BuilderInnerClassBuilder<PARENT> withValue(BuilderInnerClass.InnerClass value) {
        this.value = value;
        valueBuilder = null;
        return this;
    }

    public InnerClassBuilder<? extends BuilderInnerClassBuilder<PARENT>> withValue() {
        if (valueBuilder == null) {
            valueBuilder = new InnerClassBuilder<>(this);
            value = null;
        }
        return valueBuilder;
    }

    public BuilderInnerClass build() {
        BuilderInnerClass result = new BuilderInnerClass();
        result.setValue(valueBuilder != null ? valueBuilder.build() : value);
        return result;
    }

    public PARENT end() {
        return parent;
    }

    public static BuilderInnerClassBuilder<Void> copyOf(BuilderInnerClass bron) {
        if (bron == null) {
            return null;
        }
        BuilderInnerClassBuilder<Void> builder = new BuilderInnerClassBuilder<>();
        builder.valueBuilder = InnerClassBuilder.copyOf(bron.getValue(), builder);
        return builder;
    }

    public static <T> BuilderInnerClassBuilder<T> copyOf(BuilderInnerClass bron, T parentBuilder) {
        if (bron == null) {
            return null;
        }
        BuilderInnerClassBuilder<T> builder = new BuilderInnerClassBuilder<>(parentBuilder);
        builder.valueBuilder = InnerClassBuilder.copyOf(bron.getValue(), builder);
        return builder;
    }

    public static class InnerClassBuilder<PARENT> {
        private String value;

        private PARENT parent;

        public InnerClassBuilder() {
        }

        public InnerClassBuilder(PARENT parent) {
            this.parent = parent;
        }

        public InnerClassBuilder<PARENT> withValue(String value) {
            this.value = value;
            return this;
        }

        public BuilderInnerClass.InnerClass build() {
            BuilderInnerClass.InnerClass result = new BuilderInnerClass.InnerClass();
            result.setValue(value);
            return result;
        }

        public PARENT end() {
            return parent;
        }

        public static InnerClassBuilder<Void> copyOf(BuilderInnerClass.InnerClass bron) {
            if (bron == null) {
                return null;
            }
            InnerClassBuilder<Void> builder = new InnerClassBuilder<>();
            builder.value = bron.getValue();
            return builder;
        }

        public static <T> InnerClassBuilder<T> copyOf(BuilderInnerClass.InnerClass bron, T parentBuilder) {
            if (bron == null) {
                return null;
            }
            InnerClassBuilder<T> builder = new InnerClassBuilder<>(parentBuilder);
            builder.value = bron.getValue();
            return builder;
        }
    }
}
