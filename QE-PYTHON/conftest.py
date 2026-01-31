import pytest

@pytest.fixture
def input_value():
    return 12

@pytest.fixture
def home_page_content():
    res=requests.get("https://training-support.net")
    content=res.content
    soup=BeautifulSoup(content,"html.parser")
    return soup

@pytest.fixture
def num_list():
    return list(range(11))
@pytest.fixture
def wallet():
    amount=0