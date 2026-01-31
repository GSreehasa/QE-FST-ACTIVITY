import pytest
@pytest.mark.xfail
@pytest.mark.great
def test_greater():
    x=2
    y=5
    assert y>x
@pytest.mark.skip
def test_equal():
    x=3
    y=3
    assert x==y