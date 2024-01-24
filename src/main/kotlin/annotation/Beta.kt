package annotation

@Target(
    AnnotationTarget.VALUE_PARAMETER,
    AnnotationTarget.PROPERTY_GETTER,
    AnnotationTarget.FIELD
)
@Retention(AnnotationRetention.RUNTIME)
@MustBeDocumented
annotation class Beta()


// @field:Beta merubah lokasi annotation hasil compile java. dari variable constructor primary
class ExampleTarget(
    @field:Beta val firstName: String,
    @get:Beta val middleName: String,
    @param:Beta val lastName: String,
)
