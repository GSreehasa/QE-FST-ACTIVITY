import pytest
@pytest.fixture
def num_list():
    return list(range(11))
def test_sum(num_list):
    assert sum(num_list)==55
