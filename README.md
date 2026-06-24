Project: Bank Account Management System

Create a class named BankAccount.

Class Variables:

* bank_name = "Trust Bank"
* total_accounts = 0

Constructor (**init**):
Accept:

* owner_name
* initial_balance
* pin
* account_number

Store them as:

* self._owner_name
* self._balance
* self.__pin
* self.__account_number

Increment total_accounts whenever a new account object is created.

Owner Name Property:

* Create a property named owner_name.
* Getter should return the name in title case.
* Setter should:

  * Reject empty strings.
  * Reject strings containing only spaces.
  * Store the stripped value.
  * Raise ValueError for invalid input.

Balance Property:

* Create a read-only property named balance.
* Getter should return current balance.
* No setter allowed.

Account Number Property:

* Create a read-only property named account_number.
* Getter should return account number.
* No setter allowed.

Instance Method: deposit(amount)

* Amount must be positive.
* Increase balance.
* Reject invalid amounts.

Instance Method: withdraw(amount, entered_pin)

* PIN must match.
* Amount must be positive.
* Balance must be sufficient.
* Deduct balance if all conditions pass.
* Reject invalid transactions.

Instance Method: display()
Display:

* Bank Name
* Owner Name
* Account Number
* Current Balance

Do not display PIN.

Class Method: change_bank_name(new_name)

* Change bank_name for all accounts.

Static Method: is_valid_pin(pin)
Rules:

* Must contain exactly 4 digits.
* Must be numeric.
  Return:
* True if valid
* False otherwise

Testing:

* Create at least 2 account objects.
* Display account information.
* Deposit money.
* Withdraw money.
* Test wrong PIN.
* Test insufficient balance.
* Test invalid deposit amount.
* Test static method.
* Test class method.
* Print total_accounts.

Required Concepts:

* Constructor (**init**)
* self
* Protected Variables (_var)
* Private Variables (__var)
* Name Mangling
* Encapsulation
* Getter
* Setter
* @property
* Read-only Property
* Validation
* Instance Variables
* Instance Methods
* Class Variables
* Class Methods
* Static Methods




import random

class BankAccount:

    bank_name = "Trust Bank"
    total_acc = 0

    def __init__(self, name, balance, pin):
        self.name = name
        self._balance = balance
        self.__pin = pin
        self.__accNo = random.random()*10


    
    @property
    def name(self):
        return self.name.title()


    @name.setter
    def name(self,newName):
        if newName =" "
        self.name = newName
