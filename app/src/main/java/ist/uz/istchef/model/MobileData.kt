package ist.uz.istchef.model

data class MobileData(
    val serverHost: String,
    val imageHost: String,
    val username: String,
    val password: String,
    val startDate: Long,
    val endDate: Long
)