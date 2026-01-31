def test_divisibility_by_3(input_value):
    assert input_value%3==0
def test_page_title(home_page_content):
    heading=home_page_content.find("hi")
    assert heading.text=="Training Support"