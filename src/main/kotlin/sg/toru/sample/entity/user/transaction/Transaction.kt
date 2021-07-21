package sg.toru.sample.entity.user.transaction

data class Transaction(
    val transactionId: Long,
    val userId: Long,
    val transactionDate: Long, // timestamp
    val transactionAmount: Double,
    val merchantName: String,
    val transactionStatus: TransactionStatus = TransactionStatus.REQUESTED,
    val paymentId: Long,
)

enum class TransactionStatus {
    SUCCESSFUL,
    PENDING,
    REFUNDED,
    REQUESTED
}
