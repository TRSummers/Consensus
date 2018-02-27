object SprintSohoUpgradeHeaders{


  val creditCheck_headers = Map(
    "Content-Type" -> "application/json",
    "ESB-CARRIER-RESPONDER" -> "ON",
    "X-PAM-SESSIONID" -> "1234567890"
  )

  val default_header = Map(
    "Content-Type" -> "application/json"
  )

  val submit_headers_json = Map(
    "Content-Type" -> "application/json",
    "ESB-CARRIER-RESPONDER" -> "ON",
    "X-PAM-SESSIONID" -> "1234567890",
    "X-PAM-CLIENT-ID" -> "ec15b0827c854c02b5696be4688e0df8",
    "X-PAM-CLIENT-SECRET" -> "9bf148a0D32c48F7B8e73D8dCd4d4890"
  )

  val validateDeviceHeaders = Map(
    "Content-Type" -> "application/json",
    "ESB-CARRIER-RESPONDER" -> "ON"
  )

  val planaddons_headers_json = Map(
    "Content-Type" -> "application/json",
    "ESB-CARRIER-RESPONDER" -> "ON",
    "orderKeyInfo" -> "{\"creditApplicationNum\":\"807931050\", \"orderNum\":\"27787\"}"
  )

  val payment_headers = Map(
    "Content-Type" -> "application/json",
    "ESB-CARRIER-RESPONDER" -> "ON",
    "orderKeyInfo" -> "{ \"billingAccountNumber\" : \"365013422873\"}",
    "X-PAM-SESSIONID" -> "1140674952"
  )

  val postputheaders = Map(
    "Content-Type" -> "application/json",
    "X-PAM-SESSION-ID" -> "6750",
    "ESB-CARRIER-RESPONDER" -> "ON",
    "X-PAM-CONVERSATIONID" -> "113355",
    "SprintLoanInfoDetails" -> "{\"99000579450714\":{\"LOAN_24\":{\"srp\":\"749.99\",\"loanFirstInstallmentDueDate\":\"2017-07-15\",\"loanLastInstallmentDueDate\":\"2019-06-15\",\"loanDownPayment\":\"320\"}}}",
    "SprintAccountInfoDetails" -> "{\"newAslInd\":\"false\",\"aslAmount\":\"11.11\",\"aslInd\":\"false\"}",
    "SprintOneTimeCharge" -> "{\"LSD129AH\":{\"features\":[{\"connectionIndex\":1,\"activationFee\":\"33\",\"lineAccess\":\"22\",\"planCode\":\"LSD129AH\"}]}}",
    "SprintSubscriptionInfoDetails" ->  "{\"LSD129AH\":{\"socDesc\":\"25GB 50% Off Promo Plan\",\"ltsRecurringChargeList\":[{\"connectionIndex\":\"1\",\"recurringCharge\":\"55.0\"}]}}",
    "orderKeyInfo" -> "{\"orderNum\":\"80124\"}",
    "X-PAM-SPRINT-CREDIT-CHECK-DETAILS" -> "{\"applicationNumber\":\"000K0315521C\",\"totalDepositAmount\":0}",
    "X-PAM-SPRINT-AGENT-ID" -> "131710003000371237"
  )

  val account_headers_json = Map(
    "Content-Type" -> "application/json",
    "ESB-CARRIER-RESPONDER" -> "ON",
    "X-PAM-SESSIONID" -> "1234"
  )
}