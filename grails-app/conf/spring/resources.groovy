import hotel.CustomTenantResolver
import hotel.UserPasswordEncoderListener
// Place your Spring DSL code here
beans = {
    userPasswordEncoderListener(UserPasswordEncoderListener)
    customTenantResolver(CustomTenantResolver)
}
