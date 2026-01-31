import pytest
import pandas as pd
@pytest.fixture
def wallet():
    amount=0
    return {"amount":amount}
@pytest.mark.parametrize(
    "earned,spent,expected",
    [
        (30,10,20),
        (20,2,18),
    ]
)
def test_transactions(wallet,earned,spent,expected):
    wallet["amount"]+=earned
    wallet["amount"]-=spent
    assert wallet["amount"]==expected
    
