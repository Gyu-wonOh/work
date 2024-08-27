import { useNavigate } from 'react-router-dom';
import useFetch from "../hooks/useFetch";

export default function CreateDay() {
    const days = useFetch("http://localhost:3010/days");
    const navigate = useNavigate();

    function addDay() {
        fetch(`http://localhost:3010/days/`, {
            method: "POST",
            headers: {
                "Content-Type": "application/json",
            },
            body: JSON.stringify({
                id:""+days.length+1,
                day: days.length + 1,
            }),
        }).then(res => {
            if (res.ok) {
                alert("생성이 완료 되었습니다");
                navigate(`/`);
            }
        });
    }
    return (
        <div>
            <h3>현재 일수 : {days.length}일</h3>
            <button onClick={addDay}>Day 추가</button>
        </div>
    );
}
