package yava.bad.kotlin.good.lol.nullabledtofield;


import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.annotation.Nullable;

/**
 * Generating DTOs for the frontend part of an app required a plugin.
 * That plugin used the POJO convention to figure out whether a typescript field had to be nullable.
 * So it used the getter and setter of each field instead of the @Nullable on the field itself.
 *
 * Because this is a DTO, it was annotated with only just @Data and @Builder, requiring the below
 * black magic to "spread" the information of the getters and setters.
 *
 * The problem here is that the Java language has no inherent notion of nullable.
 */

@Data
@Builder
public class SomeJsonData {
    @Getter(onMethod_ = {@Nullable} )
    @Setter(onMethod_ = {@Nullable} )
    private String stuff;
}
